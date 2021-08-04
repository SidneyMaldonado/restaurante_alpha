import { Component, OnInit } from '@angular/core';
import { ViewQtdPratosPedido } from 'src/entidades/ViewQtdPratosPedido';
import { ViewQtdPratosPedidoService } from '../view-qtd-pratos-pedido.service';

@Component({
  selector: 'app-view-qtd-pratos-pedido',
  templateUrl: './view-qtd-pratos-pedido.component.html',
  styleUrls: ['./view-qtd-pratos-pedido.component.css']
})
export class ViewQtdPratosPedidoComponent implements OnInit {

  pratosPedido: ViewQtdPratosPedido[] = [];

  constructor( private servico: ViewQtdPratosPedidoService) { }

  ngOnInit(): void {

    this.servico.listarTotalPratosPedido().subscribe(
      dados => this.pratosPedido = dados,
      error => alert("Erro ao consultar dados!!")

    )
  }

}
