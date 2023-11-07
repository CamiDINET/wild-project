import { Ingredient } from "./ingredient";
import { Malt } from "./malt";

export class MaltStock extends Ingredient{
    id!: number;
    malt!: Malt;
    ebc!: number;
    stockQuantity!: number
}
