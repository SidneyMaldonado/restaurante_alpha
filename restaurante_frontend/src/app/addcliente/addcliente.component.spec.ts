import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { AddclienteComponent } from './addcliente.component';
import { FormsModule } from '@angular/forms';

describe('AddclienteComponent', () => {
  let component: AddclienteComponent;
  let fixture: ComponentFixture<AddclienteComponent>;


  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddclienteComponent ],
      imports: [HttpClientTestingModule, FormsModule],
    })
    .compileComponents();
  });


  beforeEach(() => {
    fixture = TestBed.createComponent(AddclienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
   
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
