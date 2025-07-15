export interface Book {
	id: number;
	title: string;
	ISBN: string;
	photoURL: string;
	description: string;
	quantity: number;
	evaluation: string;
	author: {
		id: number;
		name: string;
		birth_date: string;
		nationality: string;
	}
}
