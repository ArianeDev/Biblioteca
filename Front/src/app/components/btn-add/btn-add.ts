import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { LucideAngularModule, PlusSquare } from 'lucide-angular';

@Component({
  selector: 'app-btn-add',
  imports: [LucideAngularModule],
  templateUrl: './btn-add.html',
  styleUrl: './btn-add.sass'
})
export class BtnAdd {
  protected readonly PlusSquare = PlusSquare

  constructor(private router: Router) {}

  navigateRegister() {
    this.router.navigate(['app/cadastrar'])
  }
}
