import { Component, OnInit } from '@angular/core';
import { ViewProdutosAlfa } from 'src/entidades/ViewProdutosAlfa';
import { ViewProdutosOrdemAlfaService } from '../servicos/view-produtos-ordem-alfa.service';

@Component({
  selector: 'app-listar-produtos-ordem-alfa',
  templateUrl: './listar-produtos-ordem-alfa.component.html',
  styleUrls: ['./listar-produtos-ordem-alfa.component.css']
})
export class ListarProdutosOrdemAlfaComponent implements OnInit {

  produtosOrdem: ViewProdutosAlfa[] = [];
  constructor( private servico: ViewProdutosOrdemAlfaService) { }

  ngOnInit(): void {

    this.servico.listarProdutosAlfa().subscribe(
      dados => this.produtosOrdem = dados,
      error => alert("Erro ao consultar dados!!")
    )
  }

}
