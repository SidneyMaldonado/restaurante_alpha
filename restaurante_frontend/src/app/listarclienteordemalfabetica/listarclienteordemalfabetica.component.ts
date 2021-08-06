import { Component, OnInit } from '@angular/core';
import { ListarClienteOrdemAlfabetica } from 'src/entidades/ListarClienteOrdemAlfabetica';
import { ListarclienteordemalfabeticaService } from '../servicos/listarclienteordemalfabetica.service';

@Component({
  selector: 'app-listarclienteordemalfabetica',
  templateUrl: './listarclienteordemalfabetica.component.html',
  styleUrls: ['./listarclienteordemalfabetica.component.css']
})
export class ListarclienteordemalfabeticaComponent implements OnInit {

  listarclientealfabeticas: ListarClienteOrdemAlfabetica[] = [];
  constructor( private servico:ListarclienteordemalfabeticaService) { }

  ngOnInit(): void {

        this.servico.listarclienteordemalfabetica().subscribe(
          dados => {this.listarclientealfabeticas = dados},
          erro => alert("Erro Ao listar Cliente Por Ordem Alfabetica!")
        )

  }

}


 