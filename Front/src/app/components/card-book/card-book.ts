import { Component, OnInit } from '@angular/core';
import { Book } from '../../models/book.model';
import { BookService } from '../../services/book-service';
import { LucideAngularModule, PencilLineIcon, Trash2 } from 'lucide-angular';

@Component({
  selector: 'app-card-book',
  imports: [LucideAngularModule],
  templateUrl: './card-book.html',
  styleUrl: './card-book.sass'
})
export class CardBook implements OnInit{
  books: Book[] = [];
  protected readonly Trash = Trash2;
  protected readonly PenIcon = PencilLineIcon;

  constructor(private bookService: BookService) {}

  ngOnInit(): void {
      this.bookService.getBooks().subscribe(data => {
        this.books = data;
      });
  }

  deleteBook(id: number) {
    this.bookService.deleteBook(id).subscribe(() => {
      this.books = this.books.filter(book => book.id !== id);
    })
  }
  
}
