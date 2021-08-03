import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarSomaPagoClienteComponent } from './listar-soma-pago-cliente.component';

describe('ListarSomaPagoClienteComponent', () => {
  let component: ListarSomaPagoClienteComponent;
  let fixture: ComponentFixture<ListarSomaPagoClienteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarSomaPagoClienteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarSomaPagoClienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
