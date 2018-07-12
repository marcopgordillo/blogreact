import { IEntry } from 'app/shared/model//entry.model';

export interface IBlog {
  id?: number;
  title?: string;
  description?: any;
  entries?: IEntry[];
}

export const defaultValue: Readonly<IBlog> = {};
