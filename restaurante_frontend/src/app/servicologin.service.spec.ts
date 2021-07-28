import { TestBed } from '@angular/core/testing';

import { ServicologinService } from './servicologin.service';
import { HttpClientTestingModule} from '@angular/common/http/testing'

describe('ServicologinService', () => {
  let service: ServicologinService;

  beforeEach(() => {
    TestBed.configureTestingModule({imports:[HttpClientTestingModule]});
    service = TestBed.inject(ServicologinService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
