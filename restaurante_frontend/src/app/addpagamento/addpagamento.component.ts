import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Pagamento } from 'src/entidades/Pagamento';
import { Pedido } from '../listar-pratos-incluir-pedidos/Pedido';
import { PedidoService } from '../pedido.service';
import { AddpagamentoService } from '../servicos/addpagamento.service';

@Component({
  selector: 'app-addpagamento',
  templateUrl: './addpagamento.component.html',
  styleUrls: ['./addpagamento.component.css']
})
export class AddpagamentoComponent implements OnInit {

  pedidos: Pedido[] = [];

  pagamento : Pagamento = { codigopedido: 0 , codigopagamento:0, valorpago: 0 };

  constructor( private servico: AddpagamentoService,
               private servicoPedido: PedidoService) { }

  ngOnInit(): void {
    this.servicoPedido.listarPedidos().subscribe(
      dados => {this.pedidos = dados, console.log(this.pedidos)},
      error => console.log("Erro ao listar pedidos")
    )
  }

  incluirPagamento( frm: NgForm){
    this.servico.incluir(this.pagamento).subscribe(
      dados => alert("Pagamento cadastrado com sucesso"),
      error => alert("Erro ao cadastrar pagamento")
    )

    
  }

}
