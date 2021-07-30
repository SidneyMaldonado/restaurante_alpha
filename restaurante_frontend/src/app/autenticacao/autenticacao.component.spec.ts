import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { RouterTestingModule } from '@angular/router/testing';

import { AutenticacaoComponent } from './autenticacao.component';

describe('AutenticacaoComponent', () => {
  let component: AutenticacaoComponent;
  let fixture: ComponentFixture<AutenticacaoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HttpClientTestingModule, FormsModule, RouterTestingModule],
      declarations: [ AutenticacaoComponent ]
    
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AutenticacaoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', ( ) => {
    expect(component).toBeTruthy();
  });
});
