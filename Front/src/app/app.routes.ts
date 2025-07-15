import { Routes } from '@angular/router';
import { Home } from './components/home/home';
import { MainLayout } from './layout/main-layout/main-layout';
import { HomeUser } from './components/home-user/home-user';

export const routes: Routes = [
	{
		path: "",
		component: Home
	},
	{
		path: "app",
		component: MainLayout,
		children: [
			{
				path: 'homeUser',
				component: HomeUser,
			}
		]
	}
];
