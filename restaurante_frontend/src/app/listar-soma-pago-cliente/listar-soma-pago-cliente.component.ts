import { Component, OnInit } from '@angular/core';
import { ViewSomaPagoCliente } from 'src/entidades/ViewSomaPagoCliente';
import { ViewSomaPagoClienteService } from '../servicos/view-soma-pago-cliente.service';

@Component({
  selector: 'app-listar-soma-pago-cliente',
  templateUrl: './listar-soma-pago-cliente.component.html',
  styleUrls: ['./listar-soma-pago-cliente.component.css']
})

export class ListarSomaPagoClienteComponent implements OnInit {

  public viewSomaPagoClientes: ViewSomaPagoCliente[] = [];

  constructor(private vspcs: ViewSomaPagoClienteService) { }

  ngOnInit(): void {

    this.vspcs.listarSomaPagoCliente().subscribe(
       dados => this.viewSomaPagoClientes = dados,
       error => console.log("Erro ao recuperar dados")
    )

  }

}
