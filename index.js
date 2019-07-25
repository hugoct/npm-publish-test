import { NativeModules } from "react-native";

const show = () => NativeModules.MinhaLibToast.exibirToast("Teste NPM !!");

export default show;
