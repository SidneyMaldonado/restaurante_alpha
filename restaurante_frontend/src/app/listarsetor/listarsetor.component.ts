import { Component, OnInit } from '@angular/core';
import { Setor } from 'src/entidades/Setor';
import { SetorService } from '../servicos/setor.service';

@Component({
  selector: 'app-listarsetor',
  templateUrl: './listarsetor.component.html',
  styleUrls: ['./listarsetor.component.css']
})
export class ListarsetorComponent implements OnInit {

  listarsetor: Setor[] = [];
  constructor( private servico: SetorService) { }

  ngOnInit(): void {
    this.servico.ListarSetor().subscribe(
      dados => this.listarsetor = dados,
      error => alert("Erro ao consultar dados!")
    )

  }

}
