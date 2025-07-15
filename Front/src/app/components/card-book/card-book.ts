import { Component, OnInit } from '@angular/core';
import { Book } from '../../models/book.model';
import { BookService } from '../../services/book-service';

@Component({
  selector: 'app-card-book',
  imports: [],
  templateUrl: './card-book.html',
  styleUrl: './card-book.sass'
})
export class CardBook implements OnInit{
  books: Book[] = [];

  constructor(private bookService: BookService) {}

  ngOnInit(): void {
      this.bookService.getBooks().subscribe(data => {
        this.books = data;
      });
  }
}
