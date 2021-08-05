import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarprodfuncionarioComponent } from './listarprodfuncionario.component';

describe('ListarprodfuncionarioComponent', () => {
  let component: ListarprodfuncionarioComponent;
  let fixture: ComponentFixture<ListarprodfuncionarioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarprodfuncionarioComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarprodfuncionarioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
