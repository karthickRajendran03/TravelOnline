import { TestBed } from '@angular/core/testing';

import { TravelsummaryService } from './travelsummary.service';

describe('TravelsummaryService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TravelsummaryService = TestBed.get(TravelsummaryService);
    expect(service).toBeTruthy();
  });
});
