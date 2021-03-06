import { Component, OnInit } from '@angular/core';
import { ViewContaPratosPedidos } from 'src/entidades/ViewContaPratosPedidos';
import { ListarcontapratospedidosService } from '../servicos/listarcontapratospedidos.service';

@Component({
  selector: 'app-listar-conta-pratos-pedidos',
  templateUrl: './listar-conta-pratos-pedidos.component.html',
  styleUrls: ['./listar-conta-pratos-pedidos.component.css']
})
export class ListarContaPratosPedidosComponent implements OnInit {


  public viewContaPratosPedidos: ViewContaPratosPedidos[] = [];

  constructor(  private servico: ListarcontapratospedidosService) { }

  ngOnInit(): void {

    this.servico.listarContaPratoPedidos().subscribe(
      dados => this.viewContaPratosPedidos = dados,
      error => console.log("Erro ao recuperar dados")
    )
  }
}
