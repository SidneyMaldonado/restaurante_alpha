import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClientesatendidosComponent } from './clientesatendidos.component';

describe('ClientesatendidosComponent', () => {
  let component: ClientesatendidosComponent;
  let fixture: ComponentFixture<ClientesatendidosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ClientesatendidosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ClientesatendidosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
