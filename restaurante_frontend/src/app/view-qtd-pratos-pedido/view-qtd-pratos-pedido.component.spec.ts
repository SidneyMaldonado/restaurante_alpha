import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewQtdPratosPedidoComponent } from './view-qtd-pratos-pedido.component';

describe('ViewQtdPratosPedidoComponent', () => {
  let component: ViewQtdPratosPedidoComponent;
  let fixture: ComponentFixture<ViewQtdPratosPedidoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewQtdPratosPedidoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewQtdPratosPedidoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
