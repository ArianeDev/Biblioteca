import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { BtnPrimary } from '../btn-primary/btn-primary';

@Component({
  selector: 'app-header',
  imports: [RouterLink],
  templateUrl: './header.html',
  styleUrl: './header.sass'
})
export class Header {

}
