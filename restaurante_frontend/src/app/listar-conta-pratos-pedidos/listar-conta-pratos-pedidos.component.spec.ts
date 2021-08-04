import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarContaPratosPedidosComponent } from './listar-conta-pratos-pedidos.component';

describe('ListarContaPratosPedidosComponent', () => {
  let component: ListarContaPratosPedidosComponent;
  let fixture: ComponentFixture<ListarContaPratosPedidosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarContaPratosPedidosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarContaPratosPedidosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
