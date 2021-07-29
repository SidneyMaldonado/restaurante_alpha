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
import { ListarfuncionarioComponent } from './listarfuncionario/listarfuncionario.component';
import { IncluirfuncionarioComponent } from './incluirfuncionario/incluirfuncionario.component';

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
    ListarfuncionarioComponent,
    IncluirfuncionarioComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
