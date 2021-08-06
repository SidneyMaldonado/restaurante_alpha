import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Cliente } from 'src/entidades/Cliente';
import { Funcionario } from 'src/entidades/Funcionario';
import { ClienteService } from '../servicos/cliente.service';
import { FuncionarioService } from '../servicos/funcionario.service';
import { PedidoService } from '../servicos/pedido.service';
import { PratoService } from '../servicos/prato.service';
import { Pedido } from './Pedido';
import { Prato } from './Prato';

@Component({
  selector: 'app-listar-pratos-incluir-pedidos',
  templateUrl: './listar-pratos-incluir-pedidos.component.html',
  styleUrls: ['./listar-pratos-incluir-pedidos.component.css']
})
export class ListarPratosIncluirPedidosComponent implements OnInit {

  pratos: Prato[]=[];
  pedido: Pedido={codigoPedido: 0, codigoPrato: 0, codigoFuncionario: 0, codigoCliente: 0, quantidade: 0, preco:0, pronto:false}
  clientes: Cliente[] = [];
  funcionarios: Funcionario[] = [];

  constructor(
     private servicoprato:PratoService,  
     private servicopedido:PedidoService,
     private servicocliente: ClienteService,
     private servicofuncionario: FuncionarioService
     ) { }

  ngOnInit(): void {
    this.servicoprato.listarPratos().subscribe(
      dados => {this.pratos = dados, console.log(dados)},
      error => console.log("Erro ao buscar dados")
    )

    this.servicocliente.Listar().subscribe(
      dados => { this.clientes = dados },
      error => console.log("erro ao ler clientes")
    )

    this.servicofuncionario.listarfuncionario().subscribe(
      dados => this.funcionarios = dados,
      error => console.log("Erro ao buscar funcionários")
    )
  }

  incluir(frm:NgForm){
    this.servicopedido.incluir(this.pedido).subscribe(
      dados=>alert("Dados gravados com sucesso!!"),
      error=> alert("erro ao gravar dados")
    )
  }
}
