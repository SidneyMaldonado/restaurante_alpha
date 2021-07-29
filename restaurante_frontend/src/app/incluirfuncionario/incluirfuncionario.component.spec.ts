import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IncluirfuncionarioComponent } from './incluirfuncionario.component';

describe('IncluirfuncionarioComponent', () => {
  let component: IncluirfuncionarioComponent;
  let fixture: ComponentFixture<IncluirfuncionarioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IncluirfuncionarioComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(IncluirfuncionarioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
