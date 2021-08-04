import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaprodutoprecoComponent } from './listaprodutopreco.component';

describe('ListaprodutoprecoComponent', () => {
  let component: ListaprodutoprecoComponent;
  let fixture: ComponentFixture<ListaprodutoprecoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListaprodutoprecoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaprodutoprecoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
