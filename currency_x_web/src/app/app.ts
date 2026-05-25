import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CambioService } from './cambio'; // Ajustado para o seu nome de ficheiro

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class AppComponent implements OnInit {
  dados: any;

  constructor(private cambioService: CambioService) {}

  ngOnInit(): void {
    this.cambioService.getTaxas().subscribe({
      next: (res) => {
        this.dados = res;
        console.log('Dados recebidos do Java:', res);
      },
      error: (err) => console.error('Erro ao ligar ao Java:', err)
    });
  }
}
