import { Component } from '@angular/core';
import { CardBook } from '../card-book/card-book';
import { BtnAdd } from '../btn-add/btn-add';

@Component({
  selector: 'app-home-user',
  imports: [CardBook, BtnAdd],
  templateUrl: './home-user.html',
  styleUrl: './home-user.sass'
})
export class HomeUser {

}
