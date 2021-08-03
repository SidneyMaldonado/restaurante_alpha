import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarclienteordemalfabeticaComponent } from './listarclienteordemalfabetica.component';

describe('ListarclienteordemalfabeticaComponent', () => {
  let component: ListarclienteordemalfabeticaComponent;
  let fixture: ComponentFixture<ListarclienteordemalfabeticaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarclienteordemalfabeticaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarclienteordemalfabeticaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
