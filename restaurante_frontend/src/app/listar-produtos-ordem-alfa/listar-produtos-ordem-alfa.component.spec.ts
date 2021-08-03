import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarProdutosOrdemAlfaComponent } from './listar-produtos-ordem-alfa.component';

describe('ListarProdutosOrdemAlfaComponent', () => {
  let component: ListarProdutosOrdemAlfaComponent;
  let fixture: ComponentFixture<ListarProdutosOrdemAlfaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarProdutosOrdemAlfaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarProdutosOrdemAlfaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
