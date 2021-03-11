var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":312,"id":26085,"methods":[{"el":63,"sc":2,"sl":53},{"el":76,"sc":2,"sl":74},{"el":88,"sc":2,"sl":86},{"el":157,"sc":2,"sl":90},{"el":172,"sc":2,"sl":169},{"el":187,"sc":2,"sl":182},{"el":205,"sc":2,"sl":197},{"el":252,"sc":2,"sl":215},{"el":268,"sc":2,"sl":254},{"el":283,"sc":2,"sl":270},{"el":287,"sc":2,"sl":285},{"el":291,"sc":2,"sl":289},{"el":295,"sc":2,"sl":293},{"el":299,"sc":2,"sl":297},{"el":303,"sc":2,"sl":301},{"el":307,"sc":2,"sl":305},{"el":311,"sc":2,"sl":309}],"name":"BermudanSwaption","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_129":{"methods":[{"sl":90},{"sl":169},{"sl":182},{"sl":197},{"sl":215}],"name":"testVega[Bermudan Swaption 30.0 in 40.0]","pass":true,"statements":[{"sl":94},{"sl":95},{"sl":96},{"sl":99},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":109},{"sl":112},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":128},{"sl":129},{"sl":132},{"sl":135},{"sl":139},{"sl":141},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":171},{"sl":183},{"sl":184},{"sl":186},{"sl":199},{"sl":200},{"sl":217},{"sl":220},{"sl":221},{"sl":223},{"sl":224},{"sl":227},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":246},{"sl":247},{"sl":251}]},"test_199":{"methods":[{"sl":90},{"sl":169},{"sl":182},{"sl":197},{"sl":215}],"name":"testDelta[Bermudan Swaption 30.0 in 40.0]","pass":true,"statements":[{"sl":94},{"sl":95},{"sl":96},{"sl":99},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":109},{"sl":112},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":128},{"sl":129},{"sl":132},{"sl":135},{"sl":139},{"sl":141},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":171},{"sl":183},{"sl":184},{"sl":186},{"sl":199},{"sl":200},{"sl":217},{"sl":220},{"sl":221},{"sl":223},{"sl":224},{"sl":227},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":246},{"sl":247},{"sl":251}]},"test_283":{"methods":[{"sl":53},{"sl":74},{"sl":86},{"sl":90},{"sl":169},{"sl":182},{"sl":197},{"sl":215}],"name":"testBermudanSwaption","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":75},{"sl":87},{"sl":94},{"sl":95},{"sl":96},{"sl":99},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":109},{"sl":112},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":128},{"sl":129},{"sl":132},{"sl":135},{"sl":139},{"sl":141},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":171},{"sl":183},{"sl":184},{"sl":186},{"sl":199},{"sl":200},{"sl":217},{"sl":220},{"sl":221},{"sl":223},{"sl":224},{"sl":227},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":246},{"sl":247},{"sl":251}]},"test_327":{"methods":[{"sl":90},{"sl":169},{"sl":182},{"sl":197},{"sl":215}],"name":"testGenericDelta[Bermudan Swaption 30.0 in 40.0]","pass":true,"statements":[{"sl":94},{"sl":95},{"sl":96},{"sl":99},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":109},{"sl":112},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":128},{"sl":129},{"sl":132},{"sl":135},{"sl":139},{"sl":141},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":171},{"sl":183},{"sl":184},{"sl":186},{"sl":199},{"sl":200},{"sl":217},{"sl":220},{"sl":221},{"sl":223},{"sl":224},{"sl":227},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":246},{"sl":247},{"sl":251}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [283], [283], [283], [283], [283], [283], [283], [283], [283], [283], [], [], [], [], [], [], [], [], [], [], [], [283], [283], [], [], [], [], [], [], [], [], [], [], [283], [283], [], [], [129, 199, 283, 327], [], [], [], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [], [], [129, 199, 283, 327], [], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [], [], [129, 199, 283, 327], [], [], [129, 199, 283, 327], [], [], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [], [], [129, 199, 283, 327], [129, 199, 283, 327], [], [], [], [], [], [], [129, 199, 283, 327], [129, 199, 283, 327], [], [], [129, 199, 283, 327], [], [], [129, 199, 283, 327], [], [], [], [129, 199, 283, 327], [], [129, 199, 283, 327], [], [], [], [], [], [], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [], [], [], [], [], [], [], [], [], [], [], [], [129, 199, 283, 327], [], [129, 199, 283, 327], [], [], [], [], [], [], [], [], [], [], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [], [129, 199, 283, 327], [], [], [], [], [], [], [], [], [], [], [129, 199, 283, 327], [], [129, 199, 283, 327], [129, 199, 283, 327], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [129, 199, 283, 327], [], [129, 199, 283, 327], [], [], [129, 199, 283, 327], [129, 199, 283, 327], [], [129, 199, 283, 327], [129, 199, 283, 327], [], [], [129, 199, 283, 327], [], [], [], [], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [], [], [], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [129, 199, 283, 327], [], [], [], [129, 199, 283, 327], [129, 199, 283, 327], [], [], [], [129, 199, 283, 327], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]