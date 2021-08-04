import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddclienteComponent } from './addcliente/addcliente.component';
import { FormsModule } from '@angular/forms';
import { AddpagamentoComponent } from './addpagamento/addpagamento.component';
import { PrincipalComponent } from './principal/principal.component';
import { ListarpratoprontoComponent } from './listarpratopronto/listarpratopronto.component';
import { ListarFaturamentoComponent } from './listar-faturamento/listar-faturamento.component';
import { ListarPratosIncluirPedidosComponent } from './listar-pratos-incluir-pedidos/listar-pratos-incluir-pedidos.component';
import { AutenticacaoComponent } from './autenticacao/autenticacao.component';
import { IncluirPratosComponent } from './incluir-pratos/incluir-pratos.component';
import { ListarProdutoComponent } from './listar-produto/listar-produto.component';
import { IncluirProdutoComponent } from './incluir-produto/incluir-produto.component';
import { RouterModule } from '@angular/router';
import { ListarSomaPagoClienteComponent } from './listar-soma-pago-cliente/listar-soma-pago-cliente.component';
<<<<<<< HEAD
import { ListarContaPratosPedidosComponent } from './listar-conta-pratos-pedidos/listar-conta-pratos-pedidos.component';
import { ListaprodutoprecoComponent } from './listaprodutopreco/listaprodutopreco.component';
=======
import { ListarProdutosOrdemAlfaComponent } from './listar-produtos-ordem-alfa/listar-produtos-ordem-alfa.component';
import { ViewQtdPratosPedidoComponent } from './view-qtd-pratos-pedido/view-qtd-pratos-pedido.component';
>>>>>>> fb72318d83c5ee2479d32f01a6246d4bbeeb6fd9

@NgModule({
  declarations: [
    AppComponent,
    AddclienteComponent,
    AddpagamentoComponent,
    PrincipalComponent,
    ListarpratoprontoComponent,
    ListarFaturamentoComponent,
    ListarPratosIncluirPedidosComponent,
    AutenticacaoComponent,
    IncluirPratosComponent,
    ListarProdutoComponent,
    IncluirProdutoComponent,
    ListarSomaPagoClienteComponent,
<<<<<<< HEAD
    ListarContaPratosPedidosComponent,
    ListaprodutoprecoComponent
=======
    ListarProdutosOrdemAlfaComponent,
    ViewQtdPratosPedidoComponent
>>>>>>> fb72318d83c5ee2479d32f01a6246d4bbeeb6fd9

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
