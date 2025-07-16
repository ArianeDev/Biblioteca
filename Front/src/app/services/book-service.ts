import { Injectable } from '@angular/core';
import { environment } from '../environments/environment';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Book, BookRegister } from '../models/book.model';

@Injectable({
  providedIn: 'root'
})
export class BookService {
  private apiUrl = environment.apiBooks;

  constructor(private http: HttpClient) {}

  getBooks(): Observable<Book[]> {
    return this.http.get<Book[]>(this.apiUrl);
  }

  postBook(book: BookRegister): Observable<BookRegister> {
    return this.http.post<BookRegister>(this.apiUrl, book);
  } 

  deleteBook(id: number) {
    return this.http.delete(`${this.apiUrl}/${id}`)
  }
}
