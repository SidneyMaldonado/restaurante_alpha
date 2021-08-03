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
import { ListarProdutosOrdemAlfaComponent } from './listar-produtos-ordem-alfa/listar-produtos-ordem-alfa.component';
import { ViewQtdPratosPedidoComponent } from './view-qtd-pratos-pedido/view-qtd-pratos-pedido.component';

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
    ListarProdutosOrdemAlfaComponent,
    ViewQtdPratosPedidoComponent

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
