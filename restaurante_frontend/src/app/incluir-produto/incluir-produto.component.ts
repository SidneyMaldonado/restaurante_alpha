import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Produto } from 'src/Produto';
import { ProdutoService } from '../produto.service';

@Component({
  selector: 'app-incluir-produto',
  templateUrl: './incluir-produto.component.html',
  styleUrls: ['./incluir-produto.component.css']
})
export class IncluirProdutoComponent implements OnInit {

  produto: Produto={ codigo:0, nome:"", preco:0, quantidade:0}
  constructor(private servicoincluirproduto:ProdutoService) { }

  ngOnInit(): void {
  }

  incluir(frm:NgForm){
    this.servicoincluirproduto.IncluirProduto(this.produto).subscribe(
       dados=>alert("Dados Gravados com Sucesso!"),
       error=>alert("Erro ao Gravar dados")
    )
  }
       
  }


