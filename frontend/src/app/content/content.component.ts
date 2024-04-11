import { Component } from '@angular/core';
import { AxiosService } from '../axios.service';
import { LoginFormComponent } from '../login-form/login-form.component';
import { WelcomeContentComponent } from '../welcome-content/welcome-content.component';

@Component({
  selector: 'app-content',
  standalone: true,
  imports: [WelcomeContentComponent, LoginFormComponent],
  templateUrl: './content.component.html',
  styleUrl: './content.component.scss',
})
export class ContentComponent {
  constructor(private axiosService: AxiosService) {}

  onLogin(input: any): void {
    this.axiosService.request('POST', '/login', {
      login: input.login,
      password: input.password,
    });
  }
}
