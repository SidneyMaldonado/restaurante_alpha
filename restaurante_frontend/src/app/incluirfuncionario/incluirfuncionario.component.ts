import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Funcionario } from 'src/entidades/Funcionario';
import { FuncionarioService } from '../servicos/funcionario.service';


@Component({
  selector: 'app-incluirfuncionario',
  templateUrl: './incluirfuncionario.component.html',
  styleUrls: ['./incluirfuncionario.component.css']
})
export class IncluirfuncionarioComponent implements OnInit {

  funcionario : Funcionario={codigo:0, nome:"", salario:0, codigoSetor:0};

  constructor( private servico:FuncionarioService) { }

  ngOnInit(): void {
  }

  incluir(frm:NgForm){
    this.servico.incluirfuncionario(this.funcionario).subscribe(
      dados=>alert("Dados gravados com sucesso!!"),
      error=> alert("erro ao gravar dados")
    )
  }

}
