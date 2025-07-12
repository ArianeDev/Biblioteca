import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-btn-primary',
  imports: [],
  templateUrl: './btn-primary.html',
  styleUrl: './btn-primary.sass'
})
export class BtnPrimary {
  @Input() name_value: string = "Enviar";
}
