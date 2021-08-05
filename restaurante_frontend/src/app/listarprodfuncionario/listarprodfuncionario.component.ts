import { Component, OnInit } from '@angular/core';
import { ListarProdutoFuncionario } from 'src/entidades/ListarProdutoFuncionario';
import { ListarprodutofuncionarioService } from '../listarprodutofuncionario.service';

@Component({
  selector: 'app-listarprodfuncionario',
  templateUrl: './listarprodfuncionario.component.html',
  styleUrls: ['./listarprodfuncionario.component.css']
})
export class ListarprodfuncionarioComponent implements OnInit {

  listarprodutofuncionario:ListarProdutoFuncionario[] = [];
  constructor(private service:ListarprodutofuncionarioService) { }


  ngOnInit(): void {

    this.service.listarprodutofuncionario().subscribe(
        
    dados =>{this.listarprodutofuncionario = dados},
    error => alert("Erro ao listar Produto por Funcionario")

    )
  }

}
