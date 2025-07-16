import { Component } from '@angular/core';
import { BtnPrimary } from '../btn-primary/btn-primary';
import { Author } from '../../models/author.model';
import { AuthorService } from '../../services/author-service';
import { FormsModule } from '@angular/forms';
import { BookService } from '../../services/book-service';

@Component({
  selector: 'app-forms',
  imports: [BtnPrimary, FormsModule],
  templateUrl: './forms.html',
  styleUrl: './forms.sass'
})
export class Forms {
  authors: Author[] = [];
  selectedAuthor: number | null = null;

  constructor(private authorService: AuthorService, private bookService: BookService) {}

  title = '';
  isbn = '';
  category = '';
  photoURL = '';
  description = '';
  quantity = 0;
  evaluation = '';

  ngOnInit(): void {
    this.authorService.getAuthor().subscribe(data => {
      this.authors = data;
    });
  }
  
  registerBook() {
    if (this.selectedAuthor === null) {
      console.warn('Por favor, selecione um autor antes de cadastrar');
      return;
    }

    const newBook = {
      title: this.title,
      isbn: this.isbn,
      category: this.category,
      photoURL: this.photoURL,
      description: this.description,
      quantity: this.quantity,
      evaluation: this.evaluation,
      author: {
        id: this.selectedAuthor
      }
    };

    this.bookService.postBook(newBook).subscribe(() => {
      console.log('Livro cadastrado com sucesso!');
    });
    console.log(newBook);
  }
}
