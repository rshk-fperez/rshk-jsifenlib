package com.roshka.sifen.core.types;

import java.util.Arrays;

/**
 * Este enumerado contiene los países oficiales según la SET,
 * además de sus descripiones
 */
public enum PaisType {
    DZA("Argelia"),
    EGY("Egipto"),
    LBY("Libia"),
    MAR("Marruecos"),
    SDN("Sudán"),
    TUN("Túnez"),
    ESH("Sáhara Occidental"),
    IOT("Territorio Británico del Océano Índico"),
    BDI("Burundi"),
    COM("Comoras"),
    DJI("Djibouti"),
    ERI("Eritrea"),
    ETH("Etiopía"),
    ATF("Territorio de las Tierras Australes Francesas"),
    KEN("Kenya"),
    MDG("Madagascar"),
    MWI("Malawi"),
    MUS("Mauricio"),
    MYT("Mayotte"),
    MOZ("Mozambique"),
    REU("Reunión"),
    RWA("Rwanda"),
    SYC("Seychelles"),
    SOM("Somalia"),
    SSD("Sudán del Sur"),
    UGA("Uganda"),
    TZA("República Unida de Tanzanía"),
    ZMB("Zambia"),
    ZWE("Zimbabwe"),
    AGO("Angola"),
    CMR("Camerún"),
    CAF("República Centroafricana"),
    TCD("Chad"),
    COG("Congo"),
    COD("República Democrática del Congo"),
    GNQ("Guinea Ecuatorial"),
    GAB("Gabón"),
    STP("Santo Tomé y Príncipe"),
    BWA("Botswana"),
    LSO("Lesotho"),
    NAM("Namibia"),
    ZAF("Sudáfrica"),
    SWZ("Swazilandia"),
    BEN("Benin"),
    BFA("Burkina Faso"),
    CPV("Cabo Verde"),
    CIV("Côte d'Ivoire"),
    GMB("Gambia"),
    GHA("Ghana"),
    GIN("Guinea"),
    GNB("Guinea-Bissau"),
    LBR("Liberia"),
    MLI("Malí"),
    MRT("Mauritania"),
    NER("Níger"),
    NGA("Nigeria"),
    SHN("Santa Elena"),
    SEN("Senegal"),
    SLE("Sierra Leona"),
    TGO("Togo"),
    AIA("Anguila"),
    ATG("Antigua y Barbuda"),
    ABW("Aruba"),
    BHS("Bahamas"),
    BRB("Barbados"),
    BES("Bonaire, San Eustaquio y Saba"),
    VGB("Islas Vírgenes Británicas"),
    CYM("Islas Caimán"),
    CUB("CUBA"),
    CUW("Curaçao"),
    DMA("Dominica"),
    DOM("República Dominicana"),
    GRD("Granada"),
    GLP("Guadalupe"),
    HTI("Haití"),
    JAM("Jamaica"),
    MTQ("Martinica"),
    MSR("Montserrat"),
    PRI("Puerto Rico"),
    BLM("San Bartolomé"),
    KNA("Saint Kitts y Nevis"),
    LCA("Santa Lucía"),
    MAF("San Martín (parte francesa)"),
    VCT("San Vicente y las Granadinas"),
    SXM("San Martín (parte holandés)"),
    TTO("Trinidad y Tabago"),
    TCA("Islas Turcas y Caicos"),
    VIR("Islas Vírgenes de los Estados Unidos"),
    BLZ("Belice"),
    CRI("Costa Rica"),
    SLV("El Salvador"),
    GTM("Guatemala"),
    HND("Honduras"),
    MEX("México"),
    NIC("Nicaragua"),
    PAN("Panamá"),
    ARG("Argentina"),
    BOL("Bolivia (Estado Plurinacional de)"),
    BRA("Brasil"),
    CHL("Chile"),
    COL("Colombia"),
    ECU("Ecuador"),
    FLK("Islas Malvinas (Falkland)"),
    GUF("Guayana Francesa"),
    GUY("Guyana"),
    PRY("Paraguay"),
    PER("Perú"),
    SGS("Georgia del Sur y las Islas Sandwich del Sur"),
    SUR("Suriname"),
    URY("Uruguay"),
    VEN("Venezuela (República Bolivariana de)"),
    BMU("Bermuda"),
    CAN("Canadá"),
    GRL("Groenlandia"),
    SPM("Saint Pierre y Miquelon"),
    USA("Estados Unidos de América"),
    ATA("Antártida"),
    KAZ("Kazajstán"),
    KGZ("Kirguistán"),
    TJK("Tayikistán"),
    TKM("Turkmenistán"),
    UZB("Uzbekistán"),
    CHN("China"),
    HKG("China, región administrativa especial de Hong Kong"),
    MAC("China, región administrativa especial de Macao"),
    PRK("República Popular Democrática de Corea"),
    JPN("Japón"),
    MNG("Mongolia"),
    KOR("República de Corea"),
    BRN("Brunei Darussalam"),
    KHM("Camboya"),
    IDN("Indonesia"),
    LAO("República Democrática Popular Lao"),
    MYS("Malasia"),
    MMR("Myanmar"),
    PHL("Filipinas"),
    SGP("Singapur"),
    THA("Tailandia"),
    TLS("Timor-Leste"),
    VNM("Viet Nam"),
    AFG("Afganistán"),
    BGD("Bangladesh"),
    BTN("Bhután"),
    IND("India"),
    IRN("Irán (República Islámica del)"),
    MDV("Maldivas"),
    NPL("Nepal"),
    PAK("Pakistán"),
    LKA("Sri Lanka"),
    ARM("Armenia"),
    AZE("Azerbaiyán"),
    BHR("Bahrein"),
    CYP("Chipre"),
    GEO("Georgia"),
    IRQ("Iraq"),
    ISR("Israel"),
    JOR("Jordania"),
    KWT("Kuwait"),
    LBN("Líbano"),
    OMN("Omán"),
    QAT("Qatar"),
    SAU("Arabia Saudita"),
    PSE("Estado de Palestina"),
    SYR("República Árabe Siria"),
    TUR("Turquía"),
    ARE("Emiratos Árabes Unidos"),
    YEM("Yemen"),
    BLR("Belarús"),
    BGR("Bulgaria"),
    CZE("Chequia"),
    HUN("Hungría"),
    POL("Polonia"),
    MDA("República de Moldova"),
    ROU("Rumania"),
    RUS("Federación de Rusia"),
    SVK("Eslovaquia"),
    UKR("Ucrania"),
    ALA("Islas Åland"),
    GGY("Guernsey"),
    JEY("Jersey"),
    DNK("Dinamarca"),
    EST("Estonia"),
    FRO("Islas Feroe"),
    FIN("Finlandia"),
    ISL("Islandia"),
    IRL("Irlanda"),
    IMN("Isla de Man"),
    LVA("Letonia"),
    LTU("Lituania"),
    NOR("Noruega"),
    SJM("Islas Svalbard y Jan Mayen"),
    SWE("Suecia"),
    GBR("Reino Unido de Gran Bretaña e Irlanda del Norte"),
    ALB("Albania"),
    AND("Andorra"),
    BIH("Bosnia y Herzegovina"),
    HRV("Croacia"),
    GIB("Gibraltar"),
    GRC("Grecia"),
    VAT("Santa Sede"),
    ITA("Italia"),
    MLT("Malta"),
    MNE("Montenegro"),
    PRT("Portugal"),
    SMR("San Marino"),
    SRB("Serbia"),
    SVN("Eslovenia"),
    ESP("España"),
    MKD("ex República Yugoslava de Macedonia"),
    AUT("Austria"),
    BEL("Bélgica"),
    FRA("Francia"),
    DEU("Alemania"),
    LIE("Liechtenstein"),
    LUX("Luxemburgo"),
    MCO("Mónaco"),
    NLD("Países Bajos"),
    CHE("Suiza"),
    AUS("Australia"),
    CXR("Isla de Navidad"),
    CCK("Islas Cocos (Keeling)"),
    HMD("Islas Heard y McDonald"),
    NZL("Nueva Zelandia"),
    NFK("Islas Norfolk"),
    FJI("Fiji"),
    NCL("Nueva Caledonia"),
    PNG("Papua Nueva Guinea"),
    SLB("Islas Salomón"),
    VUT("Vanuatu"),
    GUM("Guam"),
    KIR("Kiribati"),
    MHL("Islas Marshall"),
    FSM("Micronesia (Estados Federados de)"),
    NRU("Nauru"),
    MNP("Islas Marianas Septentrionales"),
    PLW("Palau"),
    UMI("Islas menores alejadas de Estados Unidos"),
    ASM("Samoa Americana"),
    COK("Islas Cook"),
    PYF("Polinesia Francesa"),
    NIU("Niue"),
    PCN("Pitcairn"),
    WSM("Samoa"),
    TKL("Tokelau"),
    TON("Tonga"),
    TUV("Tuvalu"),
    WLF("Islas Wallis y Futuna"),
    NN("NO EXISTE");

    private final String nombre;

    PaisType(String nombre) {
        this.nombre = nombre;
    }

    public static PaisType getByName(String name) {
        return Arrays.stream(PaisType.values()).filter(e -> e.name().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "{\"nombre\":\"" + nombre + "\"}";
    }
}