import { Injectable } from '@angular/core';
import { environment } from '../environments/environment';
import { Observable } from 'rxjs';
import { Author } from '../models/author.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthorService {
  private apiUrl = environment.apiAuthor;

  constructor(private http: HttpClient) {}
  
  getAuthor(): Observable<Author[]> {
    return this.http.get<Author[]>(this.apiUrl);
  }
}
