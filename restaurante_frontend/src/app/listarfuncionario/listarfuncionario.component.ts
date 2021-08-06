import { Component, OnInit } from '@angular/core';
import { Funcionario } from 'src/entidades/Funcionario';
import { FuncionarioService } from '../funcionario.service';

@Component({
  selector: 'app-listarfuncionario',
  templateUrl: './listarfuncionario.component.html',
  styleUrls: ['./listarfuncionario.component.css']
})
export class ListarfuncionarioComponent implements OnInit {

  funcionario: Funcionario[] = [];

  constructor( private servico: FuncionarioService) { }

  ngOnInit(): void {

    this.servico.listarfuncionario().subscribe(

      dados => { this.funcionario = dados},
      error => alert("Erro ao consultar dados!!")
    )
  }

}
