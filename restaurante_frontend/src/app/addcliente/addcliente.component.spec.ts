import { HttpClient } from '@angular/common/http';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpTestingController, HttpClientTestingModule } from '@angular/common/http/testing';
import { AddclienteComponent } from './addcliente.component';

describe('AddclienteComponent', () => {
  let component: AddclienteComponent;
  let fixture: ComponentFixture<AddclienteComponent>;
  let httpMock: HttpTestingController;
  let httpClient:HttpClient

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddclienteComponent ],
      imports: [HttpClientTestingModule],
      providers: [AddclienteComponent]
    })
    .compileComponents();
  });


  beforeEach(() => {
    fixture = TestBed.createComponent(AddclienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
    httpMock = TestBed.get("HttpclientTestingModule");
    httpClient = TestBed.inject(HttpClient);
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
