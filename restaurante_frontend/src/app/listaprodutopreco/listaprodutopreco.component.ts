import { Component, OnInit } from '@angular/core';
import { ListaprodutoprecoService } from '../listaprodutopreco.service';

@Component({
  selector: 'app-listaprodutopreco',
  templateUrl: './listaprodutopreco.component.html',
  styleUrls: ['./listaprodutopreco.component.css']
})
export class ListaprodutoprecoComponent implements OnInit {


  public viewListarProdutoPreco: ListaprodutoprecoService[] = [];

  constructor( private uva : ListaprodutoprecoService) { }

  ngOnInit(): void {

    this.uva.listarProdutoPreco().subscribe(
      dados => this.viewListarProdutoPreco = dados,
      error => console.log("Erro ao recuperar dados")
    )
  }

}
