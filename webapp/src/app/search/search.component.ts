import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'sma-search',
  templateUrl: './search.component.html',
  styles: [],
})
export class SearchComponent implements OnInit {
  constructor(private route: ActivatedRoute) {}

  rawKeywords: string;

  ngOnInit() {
    this.rawKeywords = this.route.snapshot.queryParams.q || '';
  }

  get isInvalid() {
    return !(!!this.keywords && this.keywords.length > 0);
  }

  get keywords() {
    if (!this.rawKeywords) return null;
    return this.rawKeywords
      .split(/\,|\;|\.|\-/)
      .filter(k => k.trim().length > 0)
      .map(k =>
        k
          .normalize('NFD')
          .replace(/[\u0300-\u036f]/g, '')
          .trim(),
      );
  }

  get formattedKeywords() {
    return !!this.keywords && this.keywords.join(';');
  }
}
