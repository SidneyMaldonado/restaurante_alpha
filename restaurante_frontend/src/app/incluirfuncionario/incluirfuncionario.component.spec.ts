import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule } from '@angular/forms';

import { IncluirfuncionarioComponent } from './incluirfuncionario.component';

describe('IncluirfuncionarioComponent', () => {
  let component: IncluirfuncionarioComponent;
  let fixture: ComponentFixture<IncluirfuncionarioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HttpClientTestingModule, FormsModule],
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
