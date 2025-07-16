import { bootstrapApplication } from '@angular/platform-browser';
import { provideHttpClient, withFetch } from '@angular/common/http';
import 'zone.js';
import { routes } from './app/app.routes';
import { provideRouter } from '@angular/router';
import { App } from './app/app';
import { importProvidersFrom } from '@angular/core';
import { FormsModule } from '@angular/forms';

bootstrapApplication(App, {
  providers: [
    importProvidersFrom(FormsModule),
    provideHttpClient(withFetch()),
    provideRouter(routes)
  ]
});