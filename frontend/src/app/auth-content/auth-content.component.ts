import { CommonModule, NgFor } from '@angular/common';
import { Component } from '@angular/core';
import { AxiosService } from '../axios.service';

@Component({
  selector: 'app-auth-content',
  standalone: true,
  imports: [CommonModule, NgFor],
  templateUrl: './auth-content.component.html',
  styleUrl: './auth-content.component.scss',
})
export class AuthContentComponent {
  data: string[] = [];

  constructor(private axiosService: AxiosService) {}

  ngOnInit(): void {
    this.axiosService
      .request('GET', '/messages', {})
      .then((response) => (this.data = response.data));
  }
}
