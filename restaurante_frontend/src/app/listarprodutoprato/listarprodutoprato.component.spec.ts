import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarprodutopratoComponent } from './listarprodutoprato.component';

describe('ListarprodutopratoComponent', () => {
  let component: ListarprodutopratoComponent;
  let fixture: ComponentFixture<ListarprodutopratoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarprodutopratoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarprodutopratoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
