import { bootstrapApplication } from '@angular/platform-browser';
import { provideHttpClient, withFetch } from '@angular/common/http';
import 'zone.js';
import { routes } from './app/app.routes';
import { provideRouter } from '@angular/router';
import { App } from './app/app';

bootstrapApplication(App, {
  providers: [
    provideHttpClient(withFetch()),
    provideRouter(routes)
  ]
});

